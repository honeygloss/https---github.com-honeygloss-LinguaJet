/* This file was generated by SableCC (http://www.sablecc.org/). */

package LinguaJet.node;

import LinguaJet.analysis.*;

public final class TLPar extends Token
{
    public TLPar()
    {
        super.setText("(");
    }

    public TLPar(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLPar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLPar(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLPar text.");
    }
}
