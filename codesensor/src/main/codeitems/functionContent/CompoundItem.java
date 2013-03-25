package main.codeitems.functionContent;

import java.util.LinkedList;

public class CompoundItem extends StatementItem
{
	public LinkedList<StatementItem> statements = new LinkedList<StatementItem>();
	
	public CompoundItem()
	{
		nodeTypeName = "STATEMENTS";	
	}
	
	public void addStatement(StatementItem stmt)
	{
		statements.add(stmt);
	}
	
}
