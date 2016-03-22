public class Stack {

	Node Top;
	
	void push (Node newNode)
	{
		if (Top == null)
		{
			Top = newNode;
		}
		else
		{
			newNode.link= Top;
			Top = newNode;
		}
	}

}
