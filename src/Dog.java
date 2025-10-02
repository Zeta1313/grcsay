class Dog implements Animal {

    /**
     * Returns the ASCII art representation of the duck.
     *
     * @return A string containing the ASCII art of the duck.
     */
    @Override
    public String getAnimalArt() {
        return"        \\   .\n" +
"         \\  ..^____/\n" +
"            `-. ___ )\n" +
"              ||   ||\n";
    }
  
    /**
     * Returns the name of the animal ("duck").
     * This method overrides the toString method to return the name of the duck.
     *
     * @return The string "duck" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "dog";
    }
  }