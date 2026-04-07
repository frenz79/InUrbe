public class Citizen {
  private static final AtomicLong idGen = new AtomicLong(0l);

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

  private Profession profession;
  
  public Citizen(LocalDate birthday, Gender gender, String firstName, String lastName, Citizen dad, Citizen mum){
    this.id = idGen.incrementAndGet();
    this.birthDay = birthDay;
    this.gender = gender;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dad = dad;
    this.mum = mum;
  }

  public Activity whatIsDoing(LocalDateTime now){
      if (profession!=null) {
          if ( now.isIn( profession.dailyPeriod() ) ){
              return Activity.STAYING;
          }
      }
  }

  
}

