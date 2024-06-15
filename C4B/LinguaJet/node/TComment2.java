/* This file was generated by SableCC (http://www.sablecc.org/). */

package LinguaJet.node;

import LinguaJet.analysis.*;

public final class TComment2 extends Token
{
    public TComment2(String text)
    {
        setText(text);
    }

    public TComment2(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TComment2(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComment2(this);
    }
}
