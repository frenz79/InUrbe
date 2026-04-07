public class Citizen {
  private sttatic final AtomicLong idGen = new AtomicLong(0l);
  static enum Gender {
    M,F
  }
  
  private final LocalDate birthDay;
  private final Gender gender;
  private final String firstName;
  private final String lastName;
  private final long id;
  private final Citizen dad;
  private final Citizen mum;
    
  private String address;
  private int worth;
  private int salary;
  private LocalDate dieDay;
    
  public Citizen(LocalDate birthday, Gender gender, String firstName, String lastName, Citizen dad, Citizen mum){
    this.id = idGen.incrementAndGet();
    this.birthDay = birthDay;
    this.gender = gender;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dad = dad;
    this.mum = mum;
  }

}

