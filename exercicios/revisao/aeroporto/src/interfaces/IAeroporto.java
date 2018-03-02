package interfaces;

public interface IAeroporto {
  public String getCodigo();
  public void setInternacional( boolean internacional );
  public boolean getInternacional();
  public boolean equals ( Aeroporto aeroposto );
  public boolean aviaoPatio ( Aviao _aviao );
  public boolean possuiRota ( Aeroporto aeroporto );
}
