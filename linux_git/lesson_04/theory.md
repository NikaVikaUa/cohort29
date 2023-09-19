## Создать новую ветку

```bash
git checkout -b новая_ветка main
```

## Переключиться на предыдущую ветку

```bash
git checkout -
```

## Просмотр журнала коммитов

```bash
git log
```

## Безопасная отмена коммита

```bash
git revert <commit_id>
```

## Перезапись последнего коммита

не применять для публичных коммитов

```bash
git commit --amend -m 'новый комментарий'
git commit --amend --no-edit # без изменения комментария

```

## Коммит не на той ветке

```bash
git branch новая_ветка
git reset --hard HEAD~1 # удалить посл. коммит
```

## Переключение состояния раб/каталога (”машина времени”)

```bash
git checkout <commit_id>
```

## Отмена незакомиченных изменений

```bash
git checkout -f # переключить раб/каталога по сост. на посл. коммит
```

## Сохранение незакомиченных изменений

```bash
git stash # сохранить изменения
git stash pop # применить сохраненные изменения
```

## Список игнорируемых файлов/каталогов / файл `.gitignore`

**Пример**

```bash
# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar
```

## Файл `README.md`

**Пример**

```markdown
## Наш проект
### Участники
- nickname 1
- nickname 2
- nickname 3
```

## Просмотр коммитов

```bash
git show # просмотр последнего коммита
git show <commit_id> 
```