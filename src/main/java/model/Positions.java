package model;

public enum Positions {
    Wireman(0),
    ElectronicsEngineer(1),
    Developer(2),
    Quarry(3);
    private int positionNumber;

    Positions(int positionNumber) {

        this.positionNumber = positionNumber;
    }
}
