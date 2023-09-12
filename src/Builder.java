public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;

    @Override
    public String toString(){
        switch (this){
            case ANY : return "Any";
            case PRS : return "Prs";
            case RYAN : return "Ryan";
            case FENDER : return "Fender";
            case MARTIN : return "Martin";
            case GIBSON : return "Gibson";
            case OLSON : return "Olson";
            case COLLINGS : return "Collings";
            default : return null;
        }
    }
}
