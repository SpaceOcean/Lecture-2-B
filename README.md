# Lecture 2
## B - Статистика слов
### Дедлайн 20/03/21 - 20 баллов

1) Разработайте набор классов на Java для текстовой разметки.
2) Класс Paragraph может содержать произвольное число других элементов разметки и текстовых элементов.
3) Класс Text – текстовый элемент.
4) Классы разметки Emphasis, Strong, Strikeout – выделение, сильное выделение и зачеркивание. Элементы разметки могут содержать произвольное число других элементов разметки и текстовых элементов.
5) Все классы должны реализовывать метод toMarkdown(StringBuilder), которой должен генерировать Markdown-разметку по следующим правилам:
    1) текстовые элементы выводятся как есть;
    2) выделенный текст окружается символами `'*'`;
    3) сильно выделенный текст окружается символами `'__'`;
    4) зачеркнутый текст окружается символами `'~'`.
6) Следующий код должен успешно компилироваться:
```
Paragraph paragraph = new Paragraph(List.of(
        new Strong(List.of(
            new Text("1"),
            new Strikeout(List.of(
                new Text("2"),
                new Emphasis(List.of(
                    new Text("3"),
                    new Text("4")
                )),
                new Text("5")
            )),
            new Text("6")
        ))
    ));
```
    
Вызов `paragraph.toMarkdown(new StringBuilder())` должен заполнять переданный `StringBuilder` следующим содержимым:
`__1~2*34*5~6__`
7) Разработанные классы должны находиться в пакете `ru.ifmo.backend_2021.markup`.