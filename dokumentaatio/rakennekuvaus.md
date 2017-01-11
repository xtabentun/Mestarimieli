## Rakennekuvaus

Ohjelma sisältää paketit mestarimieli.gui, jolla on luokat GUI, GuessListener, LengthListener ja NameListener sekä toistaiseksi luokat mitä ohjelma ei käytä: DrawingCanvas ja Figure. Paketissa mestarimieli.logiikka löytyvät luokat Number ja Player. Paketissa mestarimieli.mestarimieli sijaitsee ohjelman Main, jolle annetaan graafinen käyttöliittymä GUI ja tekstinkäyttöliittymä UI run metodiin. 

Ui paketissa sijaitsee vielä tekstinkäyttöliittymäluokka UI. Main käyttää luokkia UI ja GUI, GUI käyttää luokkia Number ja Player, UI käyttää luokkia Number ja Player, GuessListener käyttää luokkia Number ja Player. LengthListener käyttää luokkia Number ja GUI. NameListener käyttää luokkaa Player.
