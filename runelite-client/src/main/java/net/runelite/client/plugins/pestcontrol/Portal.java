/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.pestcontrol;
import net.runelite.api.widgets.WidgetInfo;

public enum Portal
{
	PURPLE(WidgetInfo.PESTCONTROL_PURPLE_SHIELD, WidgetInfo.PESTCONTROL_PURPLE_HEALTH, WidgetInfo.PESTCONTROL_PURPLE_ICON),
	BLUE(WidgetInfo.PESTCONTROL_BLUE_SHIELD, WidgetInfo.PESTCONTROL_BLUE_HEALTH, WidgetInfo.PESTCONTROL_BLUE_ICON),
	YELLOW(WidgetInfo.PESTCONTROL_YELLOW_SHIELD, WidgetInfo.PESTCONTROL_YELLOW_HEALTH, WidgetInfo.PESTCONTROL_YELLOW_ICON),
	RED(WidgetInfo.PESTCONTROL_RED_SHIELD, WidgetInfo.PESTCONTROL_RED_HEALTH, WidgetInfo.PESTCONTROL_RED_ICON);

	private final WidgetInfo shield;
	private final WidgetInfo hitpoints;
	private final WidgetInfo icon;

	private Portal(WidgetInfo shield, WidgetInfo hitpoints, WidgetInfo icon)
	{
		this.shield = shield;
		this.hitpoints = hitpoints;
		this.icon = icon;
	}

	@Override
	public String toString()
	{
		return "Portal(" + name() + ")";
	}

	public WidgetInfo getShield()
	{
		return shield;
	}

	public WidgetInfo getHitpoints()
	{
		return hitpoints;
	}

	public WidgetInfo getIcon()
	{
		return icon;
	}
}
