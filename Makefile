LATEX=xelatex --file-line-error -shell-escape

.PHONY: default pdf distclean clean

default: pdf

pdf: assignment.pdf

assignment.pdf: assignment.tex authorinfo.tex labcover.tex
	$(LATEX) assignment
	$(LATEX) assignment

distclean: clean
	rm -f assignment.pdf

clean:
	rm -f *.log *.out *.aux *.toc *.pyg
