public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    @Override
    public String toString(){
        switch (this) {
            case ALDER : return "Alder";
            case INDIAN_ROSEWOOD: return "Indian_RoseWood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian_RoseWood";
            case CEDAR : return "Cedar";
            case MAPLE: return "Maple";
            case SITKA: return "Sitka";
            case COCOBOLO: return "Cocobolo";
            case MAHOGANY: return "Mahogany";
            case ADIRONDACK: return "Adirondack";
            default: return null;
        }
    }
}
