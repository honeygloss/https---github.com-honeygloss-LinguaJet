/* This file was generated by SableCC (http://www.sablecc.org/). */

package LinguaJet.node;

import LinguaJet.analysis.*;

public final class TMisc extends Token
{
    public TMisc(String text)
    {
        setText(text);
    }

    public TMisc(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMisc(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMisc(this);
    }
}
