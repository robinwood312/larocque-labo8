package com.example;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Etudiant {
    private final SimpleIntegerProperty numDA;
    private final SimpleStringProperty nom;
    private final SimpleStringProperty prenom;
    private final SimpleDoubleProperty moyenne;

    public Etudiant(int numDA, String nom, String prenom, double moyenne) {

        this.numDA = new SimpleIntegerProperty(numDA);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.moyenne = new SimpleDoubleProperty(moyenne);
    }

    public SimpleIntegerProperty getNumDA() {
        return numDA;
    }

    public SimpleStringProperty getNom() {
        return nom;
    }

    public SimpleStringProperty getPrenom() {
        return prenom;
    }

    public SimpleDoubleProperty getMoyenne() {
        return moyenne;
    }

    public SimpleIntegerProperty numDAProperty() {
        return numDA;
    }

    public SimpleStringProperty nomProperty() {
        return nom;
    }

    public SimpleStringProperty prenomProperty() {
        return prenom;
    }

    public SimpleDoubleProperty moyenneProperty() {
        return moyenne;
    }
}
