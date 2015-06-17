package org.xtext.ui;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.*;
import static org.xtext.ui.PlantumlHighlightingConfiguration.*;

public class PlantumlHighlightingCalculator implements ISemanticHighlightingCalculator {
	public void provideHighlightingFor( XtextResource resource,
		IHighlightedPositionAcceptor acceptor) {
		
		if(resource == null || resource.getParseResult() == null) return;
		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		
		// This loop will check the type of grammar for each node 
		// and apply a specific colour to that node.
		while( it.hasNext())
		{
			INode node = it.next();
			
			// Checks if the node is a RuleCall
			if(node.getGrammarElement() instanceof RuleCall){
				
				RuleCall rc = (RuleCall) node.getGrammarElement();				
				AbstractRule r = rc.getRule();
				
				// If the called rule is of the type START or END the specific 
				// node will be coloured according the style STND.
				if(r.getName().equals("START") || r.getName().equals("END")){
					acceptor.addPosition( node.getOffset(), node.getLength(), STND );
				}
				else if(r.getName().equals("SEQUENCE")){
					acceptor.addPosition( node.getOffset(), node.getLength(), SEQ_ARR);
				}
			}
			
			// If a node is considered a comment the node will be coloured according to the style COMMENT
			else if(node instanceof HiddenLeafNode && node.getGrammarElement() instanceof TerminalRuleImpl)
			{
				TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
				
				if( ge.getName().equalsIgnoreCase( "SL_COMMENT"))
					acceptor.addPosition( node.getOffset(), node.getLength(), COMMENT);
				
				else if(ge.getName().equalsIgnoreCase("ML_COMMENT")){
					acceptor.addPosition( node.getOffset(), node.getLength(), COMMENT);
				}
			}
			
		}
	}
}

