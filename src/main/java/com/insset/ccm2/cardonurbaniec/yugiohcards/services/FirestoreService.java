package com.insset.ccm2.cardonurbaniec.yugiohcards.services;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Service
public class FirestoreService {

    private static Firestore db;

    public static Firestore initializeFirestore(){
        // Use a service account
        InputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("./src/main/resources/static/yugiohcardsdatabase-b3bd123f5e43.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        GoogleCredentials credentials = null;
        try {
            credentials = GoogleCredentials.fromStream(serviceAccount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setProjectId("yugiohcardsdatabase")
                .setCredentials(credentials)
                .build();
        FirebaseApp.initializeApp(options);

        Firestore db = FirestoreClient.getFirestore();

        return db;
    }

    public static Firestore getDb() {
        return db;
    }

    public static void setDb(Firestore db) {
        FirestoreService.db = db;
    }
}
