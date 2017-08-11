package ru.alastar.minedonate.network.handlers.manage;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import ru.alastar.minedonate.MineDonate;
import ru.alastar.minedonate.events.MineDonateGUIHandler;
import ru.alastar.minedonate.network.packets.manage.ItemMergedPacket;

public class ItemMergedClientPacketHandler implements IMessageHandler < ItemMergedPacket, IMessage > {
	
    public ItemMergedClientPacketHandler ( ) {

    }

    @Override
    public IMessage onMessage ( ItemMergedPacket message, MessageContext ctx ) {
    	
    	MineDonate . acc . ms . currentItemStack = message . is ;
    	
    	if ( message . is != null && MineDonateGUIHandler . lastBacked != null ) {
    		
            MineDonate . proxy . clientOpenGui ( MineDonateGUIHandler . SHOP_ID ) ;
             
    	}
    	
        return null ;
        
    }
    
}