public class CitizensSim {

  private final List<Citizen> livingCitizens = new ArrayList<>();
  private final List<Citizen> deadCitizens = new ArrayList<>();
  

  public void compute( LocalDateTime now ){
      
      for (Citizen c : livingCitizens){
        switch ( c.whatIsDoing(now) ){
          case STAYING:
            break;            
          case MOVING:
            break;           
        }
      }  
  }
}
  
