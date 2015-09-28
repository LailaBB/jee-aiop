package fr.polytech.todo;

public class ToDo 
{
	private long id;
	private String name;
	private String description;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ToDo(long id, String name, String description)
	{	
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() 
	{
		System.out.println("[" + getId() + "] " + getName() + ":" + getDescription());
		
		return "Todo " + getId() + " : " + getName() + " : " + getDescription() ;
	}
	
	public static void main(String[] args)
	{
		ToDo t = new ToDo(59, "Acheter le lait", "En sortant ce soir prendre 1L d'écréme");
		t.toString();
	}

}
