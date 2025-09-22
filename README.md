# Forgematica Printer

Litematica Printer derivative unofficial (Neo)Forge port to 1.16.5. [Original Forge Port for Later Versions](https://github.com/ThinkingStudios/ForgematicaPrinter)

This extension adds printing functionality for Forgematica. Printer
allows players to build big structures more quickly by automatically placing the correct blocks around you. This port required adaptation of rendering code, mixins, and Forge 1.16.5 APIs. It is not a direct repost of the original mod but a divergent version made specifically compatible with Forge 1.16.5.

![Printer Demo](https://raw.githubusercontent.com/mdembree218/forgematica-printer-1.16.5/refs/heads/master/printer_demo.gif)

## How To Use

Using the printer is straightforward: You can toggle the feature by pressing `CAPS_LOCK` by default. To configure
variables such as
printing speed and range, open Forgematica's settings by pressing `M + C` and navigate to "Generic" tab. Printer's
configuration can be
found at the bottom of the page. You can also rebind the printing toggle under "Hotkeys" tab. Holding down `V` by
default will also
print regardless if the printer is toggled on or off.

## Issues

If you have issues with the printer, **do not** bother the original creator of
Litematica (maruohon) with them. Contact me instead. Feature requests or bugs can
be reported via [GitHub Issues](https://github.com/mdembree218/forgematica-printer-1.16.5/issues).
I'll try to keep a todo list of things
I'm planning to implement and fix, so please look for duplicates there first.

Before creating an issue, make sure you are using the latest version of the mod.
To make fixing bugs easier, include the following information in your issue:

- Minecraft version
- Forgematica version
- Printer version
- Detailed description of how to reproduce the issue
- If you can, any additional information, such as error logs, screenshots or **the incorrectly printed schematics**.

### List of know issues

Currently, the following features are still broken or missing:

- Placing liquids (printing **in** liquids works though)
- Printing without support directly in air (printInAir)
- Current algorithm for placing rails isn't perfect,
  sometimes it can't place all the rails (to avoid placing anything incorrectly).
- Legit mode? (for anticheats)

Also, TexTrue has decided that features that fix existing builds,
such as automatic excavation or correcting incorrectly placed blocks are out of the scope of this mod.

