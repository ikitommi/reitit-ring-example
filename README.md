# Reitit-ring samples

## Usage

```clj
> lein repl
```

Start the simple server (port 3000):

```clj
(require '[example.ring :as ring])
(ring/start)
```

Start the simple server (port 4000):

```clj
(require '[example.simple :as simple])
(simple/start)
```

Start the swagger server (port 5000):

```clj
(require '[example.swagger :as swagger])
(swagger/start)
```

## License

Copyright © 2018 Metosin Oy
