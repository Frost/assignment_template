XELATEX = xelatex

all:
	$(XELATEX) assignment.tex
	$(XELATEX) assignment.tex

clean:
	rm -f *{pdf,log,aux,out,toc}
