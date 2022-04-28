1 - \copy (SELECT titulo, autor, assunto, valor as valor_atual, (valor * 0.5) as valor_sugerido FROM editora WHERE assunto ilike '%biografia%') to 'C:\Users\ariadne_marques\Downloads\promocaobiografias.csv' delimiter ';' csv header;

2 -  \copy (SELECT * FROM editora where assunto ilike '%filosofia%') to 'C:\Users\ariadne_marques\Downloads\livrosfilosofia.csv' delimiter ';' csv header;

3 -  \copy (SELECT * FROM editora WHERE id in (1, 60, 56, 89)) to 'C:\Users\ariadne_marques\Downloads\algunslivros.csv' delimiter ';' csv header;

4 - \copy (SELECT titulo, autor, assunto, valor as valor_atual, (valor * 0.5) as valor_sugerido FROM editora WHERE assunto ilike '%biografia%') to 'C:\Users\ariadne_marques\Downloads\promocaofilosofia.csv' delimiter ';' csv header;

5 - copy (SELECT * FROM editora WHERE assunto ilike '%Sociologia%') to 'C:\Users\ariadne_marques\Downloads\sociologialivros.csv' delimiter ';' csv header;
