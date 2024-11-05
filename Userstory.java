public class Userstory {
    private User[] person; // 1D array of respondants
  //Variables for mins and maxes of functions
    int minAge = 15;
    int maxAge = 40;
    int minmFunctioning = 7;
    int minpFunctioning = 6;

//Reads the data from each file
  public Userstory(String nameFile, String ageFile, String mentalFunctioningFile, String physicalFunctioningFile){
  person = story(nameFile, ageFile, mentalFunctioningFile, physicalFunctioningFile);
  }
  // Returns 1D arrays 
    public User[] story(String nameFile, String ageFile, String mentalFunctioningFile, String physicalFunctioningFile){
        String[] names = FileReader.toStringArray(nameFile);
        int[] ages = FileReader.toIntArray(ageFile);   
        int[] mentalFunctionings = FileReader.toIntArray(mentalFunctioningFile);
        int[] physicalFunctionings = FileReader.toIntArray(physicalFunctioningFile);
        User[] tester = new User[names.length];
        for (int i = 0; i < tester.length; i++){
            tester[i] = new User(names[i], ages[i], physicalFunctionings[i], mentalFunctionings[i]);
        }
return tester;
  }
// Checks user qualifications
    public String checkQualifications(User j){
        if (j.getAge() < minAge || j.getAge() > maxAge) {
            return " does not meet the age criteria.";
        }
        if (j.getPhysicalFunctioning() < minpFunctioning) {
            return " does not meet the physical functioning criteria.";
        }
        if (j.getMentalFunctioning() < minmFunctioning) {
            return " does not meet the mental functioning criteria.";
        }
      return "";
    }
  //To string to print out list and whether or not user Qualified
  public String toString(){
    String result = "";
for (User human : person){
  result += human + checkQualifications(human) +"\n" ;
}
    return result;
  }
}
