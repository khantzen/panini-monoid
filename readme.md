Panini Monoid
---

Based on Cyrille Martraire panini kata https://github.com/cyriux/Monoidz-kata/blob/master/panini.md

## Run

Build the project

```bash
gradle clean build
```

If you edit and think your test will be green just put a gamble on it

```bash
./git-gamble.AppImage --pass -- gradle clean build
```

If you win the gamble your change will be commited else they will be reverted

If you think test will be red just put a gamble on it too

```bash
./git-gamble.AppImage --fail -- gradle clean build
```

If you loose your gamble your change will be reverted