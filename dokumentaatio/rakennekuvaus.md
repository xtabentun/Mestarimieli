## Rakennekuvaus

Ohjelma sisältää paketit mestarimieli.gui, jolla on luokat GUI, mestarimieli.listeners, jolla on luokat: GuessListener, LengthListener, NameListener (nämä vastaavat GUIn eri näkymien keskinäisvaihtuvuudesta ja esimerkiksi käyttäjäsyötteiden tallentumisesta), EndGameListener ja NewGameListener, jotka vastaavat menuBarin toiminnasta. Paketissa mestarimieli.areas löytyy GuessArea-luokka, joka jouhevoittaa käyttäjäsyötteiden tallentumista syötehistoria-alueelle. Paketissa mestarimieli.logiikka löytyvät luokat Number ja Player. Paketissa mestarimieli.mestarimieli sijaitsee ohjelman Main, jolle annetaan graafinen käyttöliittymä GUI ja jolla on start-metodi, joka käynnistää pelin. 

Ui paketissa sijaitsee vielä tekstinkäyttöliittymäluokka UI. Main käyttää luokkia UI ja GUI, GUI käyttää luokkia Number ja Player, UI käyttää luokkia Number ja Player, GuessListener käyttää luokkia Number ja Player. LengthListener käyttää luokkia Number ja GUI. NameListener käyttää luokkaa Player.

Ohjelman Number-luokalla on vastuu generoida pelin "ratkaisukoodi" ja luoda käyttäjälle mustien ja valkoisten (tai nollien ja rastien) määrät. Player-luokalla taas on vastuu arvausten lukumäärän päivittämisellä. Ohjelman logiikka toteutuu siis pääosin näiden luokkien perusteella. 
