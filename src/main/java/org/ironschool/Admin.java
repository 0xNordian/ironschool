package org.ironschool;

public class Admin {
    private static String schoolName;

    //SCHOOL
    public static void createSchoolName(String schoolName) {
        if(schoolName.trim().equals("")){
            throw new IllegalArgumentException("The School Name cannot remain empty");
        }
        String[] words = schoolName.trim().split(" ");
        StringBuilder modifiedString = new StringBuilder();
        for (String word : words) {
            modifiedString.append(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ");
        }
        Admin.schoolName = modifiedString.toString().trim();

    }
    public static String getSchoolName() {
        return schoolName;
    }
}