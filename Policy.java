public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private float height;  // Changed to float
    private float weight;  // Changed to float

    // No-argument constructor with default values
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0f;
        this.weight = 0.0f;
    }

    // Constructor with all necessary arguments
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, float height, float weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters for each field
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    
    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }
    
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    // Method to calculate BMI
    public double calculateBMI() {
        return (this.weight * 703.0) / (this.height * this.height);
    }

    // Method to calculate the insurance price
    public double calculateInsurancePrice() {
        double price = 600;  // base fee

        // Add fee if age > 50
        if (this.age > 50) {
            price += 75;
        }
        
        // Add fee if smoker
        if (this.smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100;
        }

        // Add additional fee based on BMI
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }
        
        return price;
    }
}
