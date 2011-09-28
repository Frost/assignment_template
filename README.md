# Inlämningsmall

Den här mallen kan användas för att skapa lite snyggare latex-inlämningar till kurser på (exempelvis) KTH.

Denna mall har stöd för godtyckliga utf8-tecken i kodlistningar (givet att man använder xelatex), vilket är något jag sett många ha problem med.

Mallen kräver att xelatex finns installerat, och fungerar bland annat på OS X med MacTex.
Vill man använda make för att bygga sina dokument behöver ha det installerat också.

## Hur gör man?

Till att börja med behöver du ha någon LaTeX-distribution (med xetex) installerad. Exempel på sånada är:

* [MacTex](http://www.tug.org/mactex/2011/) (För Mac OS X)
* [TexLive](http://www.tug.org/texlive/)
* [MikTex](http://miktex.org/)

Vidare behöver du även ha python-pluginet `Pygments` installerat.

I OS X kan du installera `Pygments` genom att köra följande kommando i terminalen:
    
    sudo easy_install pygments

Minted finns dock inte packeterat; man måste själv lägga till
`minted.sty`-filen till `/usr/local/share/texmf/tex/latex` och köra
`sudo texhash`.

Sen behöver du checka ut mallen:

    git clone git://github.com/Frost/assignment_template
    cd assignment_template

Sen skriver du din inlämning i assignment.tex. Det finns en hel del kommentarer i filen som förklarar hur man gör diverse saker, bland annat hur man kan inkludera kodlistningar på ett snyggt sätt.

När du är färdig med ditt dokument, skapar du en pdf av det genom att helt sonika köra `make` i terminalen.

