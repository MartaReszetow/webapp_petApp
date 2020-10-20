package pl.MR.javagdy4.petappka.model;

public enum Race {

    LABRADOR("labrador"),
    HUSKY("husky"),
    GOLDEN_RETRIEVER("golden"),
    MOPS("mops"),
    JAMNIK("jamnik"),
    CHIUHUAHUA("chiuhaha");

    private final String commonName;

    Race(String commonName) {
        this.commonName = commonName;
    }

    public String getCommonName() {
        return commonName;
    }
}
