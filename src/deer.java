class Deer implements Animal {

  /**
   * Returns the ASCII art representation of the cow.
   *
   * @return A string containing the ASCII art of the cow.
   */
  @Override
  public String getAnimalArt() {
      return "     \\   (             )\n" +
"      \\    `--(_   _)--\'\n" +
"       \\       Y-Y\n" +
"        \\     /@@ \\\n" +
"         \\   /     \\\n" +
"             `--\'.  \\             ,\n" +
"                 |   `.__________/)";
  }

  /**
   * Returns the name of the animal ("cow").
   * This method overrides the toString method to return the name of the cow.
   *
   * @return The string "cow" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "deer";
  }
}
