package com.example.assignment.Client;

import com.example.assignment.Model.Animal;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.example.assignment.Repository.AnimalRepository;

public class GrpcClient {
    private final ManagedChannel channel;
    private final HelloServiceGrpc.HelloServiceBlockingStub blockingStub;
    private final AnimalRepository animalRepository;

    public GrpcClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = HelloServiceGrpc.newBlockingStub(channel);
        animalRepository = new AnimalRepository();
    }

    public void shutdown() {
        channel.shutdown();
    }

    public HelloResponse sendAnimal(int id) {
        com.example.assignment.Model.Animal repoAnimal = animalRepository.getAnimalById(id);

        Animal grpcAnimal = Animal.newBuilder()
                .setId(repoAnimal.getId())
                .setDateDelivered(/* Convert LocalDate to Timestamp here */)
                .setOrigin(repoAnimal.getOrigin())
                .setWeight(repoAnimal.getWeight())
                .build();

        return blockingStub.hello(grpcAnimal);
    }

    public static void main(String[] args) {
        GrpcClient client = new GrpcClient("localhost", 50051); // Change host and port as needed

        // Example: Sending an Animal with id 1 to the gRPC server
        HelloResponse response = client.sendAnimal(1);
        System.out.println("Received response: " + response.getGreeting());

        client.shutdown();
    }
}
