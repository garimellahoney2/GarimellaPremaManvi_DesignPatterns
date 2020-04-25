
public class SpecializationFactory {
public Specialization getShape(int choice)
{
	if(choice==1)
		return new ArtificialIntelligence();
	else
		return new CloudComputing();
}
}
