package revision;

public class Patient {

    private int cin;
    private String nom;
    private String prenom;
    private int numSecuriteSociale;

    public Patient() {
    }

    public Patient(int cin, String nom, String prenom, int numSecuriteSociale) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumSecuriteSociale() {
        return numSecuriteSociale;
    }

    public void setNumSecuriteSociale(int numSecuriteSociale) {
        this.numSecuriteSociale = numSecuriteSociale;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Patient{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numSecuriteSociale=" + numSecuriteSociale + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.cin != other.cin) {
            return false;
        }
        if (this.numSecuriteSociale != other.numSecuriteSociale) {
            return false;
        }
        return true;
    }

}
