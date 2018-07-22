/**
* Copyright (c) Lambda Innovation, 2013-2016
* This file is part of LambdaLib modding library.
* https://github.com/LambdaInnovation/LambdaLib
* Licensed under MIT, see project root for more information.
*/
package cn.lambdalib2.cgui.event;

import cn.lambdalib2.cgui.Widget;

/**
 * Fired on target widget when it has lost input focus.
 */
public class LostFocusEvent implements GuiEvent {
    
    public Widget newFocus;
    
    public LostFocusEvent(Widget _newFocus) {
        newFocus = _newFocus;
    }
    
}
