# kindaJMV
According to grammatical rules which indicated in pascal.g4 ANTLR4 framework has generated new classes for parsing and executing of code on pascal such as
PascalLexer, PascalListener, PascalParser, PascalVisitor.

PascalLexer responsible for lexical analysis, which convert source sequence of characters into sequence of special tokens, which meet a grammatical rules.

PascalParser in charge of building of hierarchical tree(AST) that depended on tokens which parser get from lexer. 
The tree is a representation of the abstract syntactic structure of source code. Each node of the tree denotes a 
construct occurring in the source code.
