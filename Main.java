import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {

  static ArrayList<Person> people; 
  static String filename;
  static FileReader myFile;

  public static void main(String[] args) {

    people = new ArrayList<Person>(); 
    filename = "data.txt";
    String name = "", age = "", color = ""; 

    try {
      myFile = new FileReader(filename);
      BufferedReader reader = new BufferedReader (myFile);
    

    while (reader.ready()) {
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
    
    Person thePerson = new Person(name, Integer.parseInt(age), color); 
    people.add(thePerson);

    }

    reader.close();
    } catch (IOException exception) {
      System.out.println("An error occured: " + exception);
    }
  
  for(int i=0; i<people.size(); i++) {
    System.out.printf("%-25s %-20s %-20s %n", people.get(i).getName(), people.get(i).getAge(), people.get(i).getColor());
  }


FileWriter toWriteFile;
try 
{
    toWriteFile = new FileWriter
    ("data2.txt");

    BufferedWriter output = new
    BufferedWriter(toWriteFile);

    for(int i=0; i<people.size(); i++) {
      output.write(people.get(i).getName());
      output.newLine();
      output.write(Integer.toString(people.get(i).getAge()));
      output.newLine();
      output.write(people.get(i).getColor());
      output.newLine(); 

    people.add(new Person("Andrew", 22, "Blue"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

output.flush();

output.close();
    

    } 
  // output.write(people.get(i).getName());
    //  output.newLine();
}
catch (IOException exception) {
      System.out.println("An error occured: " + exception);
}
  }
}


/*
    try {
      myFile = new FileReader(filename);
      BufferedReader reader = new BufferedReader (myFile);
    

    while (reader.ready()) {
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
      System.out.println(name + "\t" + age + "\t" + capital);
    }
    reader.close();
    } catch (IOException exception) {
      System.out.println("An error occured: " + exception);
    }
  }
  */
