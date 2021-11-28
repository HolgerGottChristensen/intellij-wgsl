package wgslplugin.language;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public enum WGSLColours {
    IDENTIFIER("Identifier", createTextAttributesKey("WGSL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)),
    NUMBER("Number", createTextAttributesKey("WGSL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)),
    KEYWORD("Keyword", createTextAttributesKey("WGSL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)),
    STORAGE("Storage", createTextAttributesKey("WGSL_STORAGE", DefaultLanguageHighlighterColors.IDENTIFIER)),
    LINE_COMMENT("Line comment", createTextAttributesKey("WGSL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)),
    BLOCK_COMMENT("Block comment", createTextAttributesKey("WGSL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)),
    BUILTIN_FUNCTION("Built-in function", DefaultLanguageHighlighterColors.STATIC_METHOD),
    BUILTIN_TYPE("Built-in type", createTextAttributesKey("WGSL_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME)),
    PARENTHESIS("Parenthesis", createTextAttributesKey("WGSL_PAREN", DefaultLanguageHighlighterColors.PARENTHESES)),
    BRACES("Braces", createTextAttributesKey("WGSL_BRACE", DefaultLanguageHighlighterColors.BRACES)),
    BRACKETS("Brackets", createTextAttributesKey("WGSL_BRACKET", DefaultLanguageHighlighterColors.BRACKETS)),
    BAD_CHARACTER("Bad Character", createTextAttributesKey("WGSL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER));

    private final String description;
    private final TextAttributesKey attributesKey;

    WGSLColours(String description, TextAttributesKey attributesKey) {
        this.description = description;
        this.attributesKey = attributesKey;
    }

    public String description() {
        return description;
    }

    public TextAttributesKey attributes() {
        return attributesKey;
    }
}
