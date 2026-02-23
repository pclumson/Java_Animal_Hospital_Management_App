import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Main app to run the Eco-Points Recycling Tracker.
 */
public class PetCareScheduler {
	
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Pet> pets = new HashMap<>(); // Task 2
    
    public static void main(String[] args) {
        loadPetsFromFile();
        boolean running = true;
        while (running) {
            System.out.println("\n=== Pet Care Scheduler ===");
            System.out.println("1. Register Pet");
            System.out.println("2. Schedule Appointment Event");
            System.out.println("3. Display Pets");
            System.out.println("4. Display Pet Records");
            System.out.println("5. Generate Reports");
            System.out.println("6. Save and Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerPet();
                    break;
                case "2":
                    scheduleAppointment();
                    break;
                case "3":
                    displayPets();
                    break;
                case "4":
                    displayPetEvents();
                    break;
                case "5":
                    generateReports();
                    break;
                case "6":
                    savePetsToFile();
                    running = false;
                    System.out.println("Data saved. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-6.");
            }
        }
    }

    // Add the methods to handle each choice provided here
    // Task 3
    private static void registerPet() {
        // Prompt the user to enter a unique pet ID
       
        // Check if a pet with this ID already exists in the map
        
        // Prompt the user to enter the pet's name
        
        
        // Prompt the user to enter the pet's breed
       
        
        // Prompt the user to enter the pet's age
       
        // Prompt the user to enter the pet's address
        
        // Prompt the user to enter the pet's owner
       
         //joinDate = LocalDateTime.now();

        // Create a new Pet object using the provided details
       
        // Add the new pet to the pets map (using ID as the key)
        
        // Confirm to the user that the pet was registered successfully
        System.out.println("Pet registered successfully on " + pet.getJoinDate());
    }

    // Task 4
    
    // Method to schedule an appointment
    private static void scheduleAppointment() {
        
    }
    
   

    // Task 6
    private static void displayPets() {
        // Check if the pets map is empty
        
        // If there are pets, print a header first
        System.out.println("\nRegistered pets:");

        // Loop through each pet in the map and print its details
       

    // Task 6
    private static void displayPetEvents() {
        // Prompt the user to enter the pet ID
       

        // Look up the pet in the pets map using the ID
       
        // If pet is not found, show an error and exit
        

        // Print a header with the pet's name
       
        // Check if the Pet has any appointment events
        
            
            // After listing events, show the total weight recycled by this household
            System.out.println("Pet name: " + pet.getName() + pet.getBreed());

        }
    }

    // Task 7
    private static void generateReports() {
        // Check if there are any pets registered
       
      
    }
    
    private static void reportUpcomingWeek() {
       
    }
    
    
    
    private static void reportOverdueVetVisit() {
        
    }
    
    
    // Task 5
    private static void savePetsToFile() {
       
    }
    

    @SuppressWarnings("unchecked") // Suppresses unchecked cast warning when reading the object
    private static void loadPetsFromFile() {
        // Use a try-with-resources block to automatically close the input stream
        try (
           
        } catch (FileNotFoundException e) {
            // Task 8
            // If the file doesn't exist yet, that's okay — start with empty data
            System.out.println("No saved data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            // Handle other errors, like if the file is corrupted or unreadable
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
