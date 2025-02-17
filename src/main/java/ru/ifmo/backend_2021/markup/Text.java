package ru.ifmo.backend_2021.markup;

public class Text implements MarkdownInterface {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public StringBuilder toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(text);
        return stringBuilder;
    }
}