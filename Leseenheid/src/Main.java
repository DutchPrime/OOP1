import modules.LesEenheid;
import modules.Project;
import modules.Vak;
import modules.ProfessionalSkills;

public class Main {
    /**
     * This program is made to practice with Object Oriented programming.
     * This program is not functional, it only displays information stored in the objects.
     *
     * @author Koen Lippe 500794493
     */
    public static void main(String[] args) {
        //Assignment A: test LesEenheid
        LesEenheid lesEenheid = new LesEenheid("Algemeen", 3, 2);
        System.out.println(lesEenheid);
        System.out.println();

        //Assignment A: test Vak
        Vak vak = new Vak("OOP1", 3, 1, 7.8);
        System.out.println(vak);
        System.out.println();

        //Assignment A: test ProfessionalSkills
        ProfessionalSkills skill = new ProfessionalSkills("Personal Skills", 2, 1, false);
        System.out.println(skill);
        skill.setGehaald(true);
        System.out.println(skill);
        System.out.println();

        //Assignment A: test Project
        Project project = new Project(
                "Fasten Your Seatbelts", 12, 1, 7.4, 6.8, 8.0);
        System.out.println(project);
        System.out.println();

        //Assignment B: test
        Vak nogEenVak = new Vak("Databases", 3, 1);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        nogEenVak.setCijfer(5.499999);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());
        nogEenVak.setCijfer(5.5);
        System.out.println(nogEenVak.toString() + ", afgerond: " +
                nogEenVak.isAfgerond());

        ProfessionalSkills nogEenSkill = new ProfessionalSkills("ICT Ethics", 2, 2);
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());
        nogEenSkill.setGehaald(true);
        System.out.println(nogEenSkill.toString() + ", afgerond: " +
                nogEenSkill.isAfgerond());

        Project nogEenProject = new Project("Agile Development", 12, 1);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

        nogEenProject.setMethodenEnTechniekenCijfer(5.499999);
        nogEenProject.setProcescijfer(5.5);
        nogEenProject.setProductcijfer(5.5);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

        nogEenProject.setMethodenEnTechniekenCijfer(5.5);
        nogEenProject.setProcescijfer(5.4999999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

        nogEenProject.setProcescijfer(10);
        nogEenProject.setProductcijfer(5.499999);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

        nogEenProject.setProductcijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());

        nogEenProject.setMethodenEnTechniekenCijfer(10);
        System.out.println(nogEenProject.toString() + ", afgerond: " +
                nogEenProject.isAfgerond());


    }
}
