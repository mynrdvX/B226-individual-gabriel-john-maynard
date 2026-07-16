package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity16_TodoManager {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> tasks = new ArrayList<>();
            
            int choice = 0;
            
            System.out.println("================================");
            System.out.println("     CONDITIONAL TO-DO LIST");
            System.out.println("================================");
            
            // Continue displaying the menu until the user selects 6
            while (choice != 6) {
                
                System.out.println("\n----------- MENU -----------");
                System.out.println("1. Add a task");
                System.out.println("2. View all tasks");
                System.out.println("3. Update a task");
                System.out.println("4. Remove a task");
                System.out.println("5. Clear all tasks");
                System.out.println("6. Exit");
                System.out.println("----------------------------");
                System.out.print("Enter your choice: ");
                
                // Check if the user entered a valid integer
                if (!scanner.hasNextInt()) {
                    System.out.println(
                            "Invalid input. Please enter a number from 1 to 6."
                    );
                    
                    scanner.nextLine();
                    continue;
                }
                
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the remaining newline
                
                switch (choice) {
                    
                    case 1:
                        // Add a new task using add()
                        System.out.print("Enter a new task: ");
                        String newTask = scanner.nextLine().trim();
                        
                        if (newTask.isEmpty()) {
                            System.out.println("Task cannot be empty.");
                        } else {
                            tasks.add(newTask);
                            
                            System.out.println("Task added successfully.");
                            
                            // Display the current number of tasks using size()
                            System.out.println(
                                    "Total number of tasks: " + tasks.size()
                            );
                        }
                        
                        break;
                        
                    case 2:
                        // View all tasks
                        if (tasks.isEmpty()) {
                            System.out.println("Your to-do list is empty.");
                            
                            // size() returns 0 when the ArrayList is empty
                            System.out.println(
                                    "Total number of tasks: " + tasks.size()
                            );
                        } else {
                            displayTasks(tasks);
                        }
                        
                        break;
                        
                    case 3:
                        // Update an existing task using set()
                        if (tasks.isEmpty()) {
                            System.out.println(
                                    "There are no tasks to update."
                            );
                        } else {
                            displayTasks(tasks);
                            
                            System.out.print(
                                    "Enter the task number to update: "
                            );
                            
                            if (!scanner.hasNextInt()) {
                                System.out.println(
                                        "Invalid input. Enter a task number."
                                );
                                
                                scanner.nextLine();
                                break;
                            }
                            
                            int updateNumber = scanner.nextInt();
                            scanner.nextLine();
                            
                            // Convert the displayed task number into an index
                            int updateIndex = updateNumber - 1;
                            
                            // size() is used to check if the index is valid
                            if (updateIndex >= 0
                                    && updateIndex < tasks.size()) {
                                
                                System.out.print("Enter the updated task: ");
                                String updatedTask =
                                        scanner.nextLine().trim();
                                
                                if (updatedTask.isEmpty()) {
                                    System.out.println(
                                            "Updated task cannot be empty."
                                    );
                                } else {
                                    String oldTask = tasks.set(
                                            updateIndex,
                                            updatedTask
                                    );
                                    
                                    System.out.println(
                                            "Task updated successfully."
                                    );
                                    
                                    System.out.println(
                                            "Old task: " + oldTask
                                    );
                                    
                                    System.out.println(
                                            "New task: " + updatedTask
                                    );
                                }
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        }
                        
                        break;
                        
                    case 4:
                        // Remove an existing task using remove()
                        if (tasks.isEmpty()) {
                            System.out.println(
                                    "There are no tasks to remove."
                            );
                        } else {
                            displayTasks(tasks);
                            
                            System.out.print(
                                    "Enter the task number to remove: "
                            );
                            
                            if (!scanner.hasNextInt()) {
                                System.out.println(
                                        "Invalid input. Enter a task number."
                                );

                                scanner.nextLine();
                                break;
                            }
                            
                            int removeNumber = scanner.nextInt();
                            scanner.nextLine();
                            
                            // Convert the displayed task number into an index
                            int removeIndex = removeNumber - 1;
                            
                            // size() is used to validate the index
                            if (removeIndex >= 0
                                    && removeIndex < tasks.size()) {
                                
                                String removedTask =
                                        tasks.remove(removeIndex);
                                
                                System.out.println(
                                        "Task removed successfully."
                                );

                                System.out.println(
                                        "Removed task: " + removedTask
                                );

                                // Display the remaining number of tasks
                                System.out.println(
                                        "Remaining tasks: " + tasks.size()
                                );
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        }
                        
                        break;
                        
                    case 5:
                        // Clear all tasks using clear()
                        if (tasks.isEmpty()) {
                            System.out.println(
                                    "The to-do list is already empty."
                            );

                            System.out.println(
                                    "Total number of tasks: " + tasks.size()
                            );
                        } else {
                            System.out.print(
                                    "Are you sure you want to clear "
                                            + "all tasks? (yes/no): "
                            );
                            
                            String confirmation =
                                    scanner.nextLine().trim();
                            
                            if (confirmation.equalsIgnoreCase("yes")
                                    || confirmation.equalsIgnoreCase("y")) {
                                
                                tasks.clear();
                                
                                System.out.println(
                                        "All tasks have been cleared."
                                );
                                
                                // The size becomes 0 after clear()
                                System.out.println(
                                        "Total number of tasks: " + tasks.size()
                                );
                            } else {
                                System.out.println(
                                        "Clear operation cancelled."
                                );
                            }
                        }
                        
                        break;
                        
                    case 6:
                        // Exit the program
                        System.out.println(
                                "\nThank you for using the "
                                        + "To-Do List Manager."
                        );

                        System.out.println("Program closed.");
                        
                        break;
                        
                    default:
                        System.out.println(
                                "Invalid choice. Please select from 1 to 6."
                        );
                }
            }
        }
    }

    // Method for displaying all tasks
    public static void displayTasks(ArrayList<String> tasks) {

        System.out.println("\n------- YOUR TASKS -------");

        // Explicitly display the number of tasks using size()
        System.out.println(
                "Total number of tasks: " + tasks.size()
        );

        // size() controls how many times the loop runs
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + tasks.get(i)
            );
        }

        System.out.println("--------------------------");
    }
}