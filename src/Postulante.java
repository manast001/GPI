import java.util.*;

public class Postulante {
	/*
	 * Variable Privadas
	 */
	private int x,y;
	private List<Integer> respuestas;
	public String rol;
	/*
	 * Constructor
	 */
	public Postulante()
	{
		this.respuestas=new ArrayList<Integer>();
		
		this.x=this.y=0;
	}
	/*
	 * Metodos Publicos
	 */
	public void addAnswerByIndex(Integer answer,int index)
	{
		this.respuestas.add(index, answer);
		
	}
}
