package visitors;// Generated from D:/home/compilers/src/main/resources\pascal.g4 by ANTLR 4.7


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import parsers.PascalParser;
import variables.Variable;


/**
 * This class provides an empty implementation of {@link PascalVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class PascalBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PascalVisitor<T> {
    private final Map<String, Variable> variables;

    private final List<String> lines;


    public PascalBaseVisitor() {
        this.variables = new HashMap<String, Variable>();
        this.lines = new ArrayList<String>();
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgram(PascalParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgramHeading(PascalParser.ProgramHeadingContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIdentifier(PascalParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBlock(PascalParser.BlockContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUsesUnitsPart(PascalParser.UsesUnitsPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLabelDeclarationPart(PascalParser.LabelDeclarationPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLabel(PascalParser.LabelContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantChr(PascalParser.ConstantChrContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstant(PascalParser.ConstantContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx) {
        lines.add("SIPUCH  " + ctx.getChild(0).getText());
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedReal(PascalParser.UnsignedRealContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSign(PascalParser.SignContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitString(PascalParser.StringContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeDefinition(PascalParser.TypeDefinitionContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionType(PascalParser.FunctionTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureType(PascalParser.ProcedureTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitType(PascalParser.TypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleType(PascalParser.SimpleTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitScalarType(PascalParser.ScalarTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSubrangeType(PascalParser.SubrangeTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStructuredType(PascalParser.StructuredTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnpackedStructuredType(PascalParser.UnpackedStructuredTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStringtype(PascalParser.StringtypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitArrayType(PascalParser.ArrayTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeList(PascalParser.TypeListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIndexType(PascalParser.IndexTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitComponentType(PascalParser.ComponentTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordType(PascalParser.RecordTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFieldList(PascalParser.FieldListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFixedPart(PascalParser.FixedPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordSection(PascalParser.RecordSectionContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariantPart(PascalParser.VariantPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTag(PascalParser.TagContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariant(PascalParser.VariantContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSetType(PascalParser.SetTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBaseType(PascalParser.BaseTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFileType(PascalParser.FileTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitPointerType(PascalParser.PointerTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFormalParameterList(PascalParser.FormalParameterListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParameterGroup(PascalParser.ParameterGroupContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIdentifierList(PascalParser.IdentifierListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstList(PascalParser.ConstListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitResultType(PascalParser.ResultTypeContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatement(PascalParser.StatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleStatement(PascalParser.SimpleStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx) {
        visit(ctx.getChild(2));
        visit(ctx.getChild(0));
        final Variable variable = variables.get(ctx.getChild(0).getText());
        lines.add(variable.getType() + "STORE " + variable.getId());

        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariable(PascalParser.VariableContext ctx) {
        final String var = ctx.getChild(0).getText();
        if (!variables.containsKey(var)) {
            variables.put(var, new Variable(variables.keySet().size() + 1, "I"));
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpression(PascalParser.ExpressionContext ctx) {
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            String znak = ctx.getChild(i * 2 - 1).getText();
            if (znak.equals("<")) {
                lines.add("IF_ICMPGE");
            } else if (znak.equals(">")) {
                lines.add("IF_ICMPLE");
            } else if (znak.equals("=")) {
                lines.add("IF_ICMPNE");
            }
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleExpression(PascalParser.SimpleExpressionContext ctx) {
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            String znak = ctx.getChild(i * 2 - 1).getText();
            if (znak.equals("+")) {
                lines.add("IADD");
            } else {
                lines.add("ISUB");
            }
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTerm(PascalParser.TermContext ctx) {
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            String znak = ctx.getChild(i * 2 - 1).getText();
            if (znak.equals("*")) {
                lines.add("IMUL");
            } else {
                lines.add("IDIV");
            }
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSignedFactor(PascalParser.SignedFactorContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFactor(PascalParser.FactorContext ctx) {
        if (ctx.getChild(0) instanceof PascalParser.VariableContext) {
            final Variable variable = variables.get(ctx.getChild(0).getText());
            lines.add(variable.getType() + "LOAD   " + variable.getId());
            return null;
        } else {
            return visitChildren(ctx);
        }
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedConstant(PascalParser.UnsignedConstantContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParameterList(PascalParser.ParameterListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSet(PascalParser.SetContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitElementList(PascalParser.ElementListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitElement(PascalParser.ElementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureStatement(PascalParser.ProcedureStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitActualParameter(PascalParser.ActualParameterContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitGotoStatement(PascalParser.GotoStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitEmptyStatement(PascalParser.EmptyStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitEmpty(PascalParser.EmptyContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStructuredStatement(PascalParser.StructuredStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCompoundStatement(PascalParser.CompoundStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatements(PascalParser.StatementsContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConditionalStatement(PascalParser.ConditionalStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIfStatement(PascalParser.IfStatementContext ctx) {
        visit(ctx.getChild(1));
        final Integer line = lines.size() - 1;
        final ParseTree then = ctx.getChild(3);
        visit(then);
        lines.add("goto");
        final Integer thenLine = lines.size() - 1;
        final ParseTree eelse = ctx.getChild(5);
        if (eelse != null) {
            final String s1 = lines.get(line) + "   " + lines.size();
            lines.remove(lines.get(line));
            lines.add(line, s1);
            visit(eelse);
        }

        final String s2 = lines.get(thenLine) + "   " + lines.size();
        lines.remove(lines.get(thenLine));
        lines.add(thenLine, s2);
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCaseStatement(PascalParser.CaseStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCaseListElement(PascalParser.CaseListElementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRepetetiveStatement(PascalParser.RepetetiveStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitWhileStatement(PascalParser.WhileStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRepeatStatement(PascalParser.RepeatStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitForStatement(PascalParser.ForStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitForList(PascalParser.ForListContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitInitialValue(PascalParser.InitialValueContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFinalValue(PascalParser.FinalValueContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitWithStatement(PascalParser.WithStatementContext ctx) {
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordVariableList(PascalParser.RecordVariableListContext ctx) {
        return visitChildren(ctx);
    }


    public String getCode() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            result.append(i).append(": ").append(lines.get(i)).append("\n");
        }
        return result.toString();
    }
}