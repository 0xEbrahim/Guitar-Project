public class GuitarSpecs {
   private Builder builder;
   private String model;
    private Type type;
    private int numString;
    private Wood backWood,topWood;

    public GuitarSpecs(Builder builder, Type type,String model, Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.model = model;
        this.topWood = topWood;
        this.numString = numString;
    }

    public int getNumString() {
        return numString;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
    public boolean matches(GuitarSpecs otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (numString != otherSpec.numString)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "GuitarSpecs{" +
                "builder=" + builder +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", numString=" + numString +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }
}
