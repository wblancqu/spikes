package com.github.wblancqu.spikes.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

public class MongoTest {

    @Test
    public void testMongo() {
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        MongoDatabase test = mongoClient.getDatabase("test");
        MongoCollection<Document> restaurants = test.getCollection("restaurants");
        Document document = restaurants.find().first();
        System.out.println(document.toJson());
    }
}
