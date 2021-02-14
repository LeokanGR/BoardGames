/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ypaat.boardgames;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Div;
import org.zkoss.zul.Include;
import org.zkoss.zul.Menubar;
import org.zkoss.zul.Menuitem;
import org.zkoss.zul.Vlayout;
import org.zkoss.zul.Window;

/**
 *
 * @author user
 */
public class IndexMenuBarController extends SelectorComposer<Menubar> {

    @Wire
    Menuitem add_a_new_game_mntm;

    @Wire
    Menuitem edit_a_game_mntm;
    
    @Wire
    Menuitem delete_a_game_mntm;
    
    @Wire
    Menuitem add_a_new_player_mntm;
    
    @Wire
    Menuitem edit_a_player_mntm;
    
    @Wire
    Menuitem delete_a_player_mntm;
    
    @Wire
    Menuitem add_a_new_match_mntm;
    
    @Wire
    Menuitem edit_a_match_mntm;
    
    @Wire
    Menuitem delete_a_match_mntm;
    
    @Wire
    Div main_area_zk;
            
    @Listen("onClick=#add_a_new_player_mntm")
    public void AddANewPlayer(Event e)
    {
        Include in = new Include();
        
//        in.setSrc("/player/add_a_new_player.zul");
//        main_area_zk.appendChild(in);
//        
        //create a window programmatically and use it as a modal dialog.
        Window window = (Window)Executions.createComponents(
                "/player/add_a_new_player.zul", null, null);
        window.doModal();
        
        
        
//        in.afterCompose();
    }
}
