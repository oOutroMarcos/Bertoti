#!pip install pytelegrambotapi
#!pip install transformers

import telebot
import random
from transformers import pipeline

def roll(limit = 20,times = 1):
  total = 0
  for n in range(times):
      total += random.randint(1,limit)
  return total

TOKEN = ''
bot = telebot.TeleBot(TOKEN)

classificador = pipeline("zero-shot-classification")
pr = pipeline("question-answering", model="timpal0l/mdeberta-v3-base-squad2", tokenizer="timpal0l/mdeberta-v3-base-squad2")

intencoes = ['saudação olá oi eae salve','d20','d4','d6','d8','d10','d12','d100']

estado = 1

@bot.message_handler(func=lambda message: True)
def reply(message):
    global estado
    
    mensagem_usr = message.text

    if estado == 1 :
      bot.reply_to(message,"Olá eu sou um bot para rodar dados de RPG posso rodar  1d4, 1d6, 1d8, 1d10, 1d12, 1d20 e um 1d100")
      estado = 2
    if estado == 2:
      intecao = ''
      intecao = classificador(mensagem_usr, intencoes)["labels"][0]
      print(intecao)
      if intecao == 'd20':
        resultado = "O Resultado da rolagem do d20 foi "+ str(roll())
        bot.reply_to(message,resultado)
      elif intecao == 'd4':
        resultado = "O Resultado da rolagem do d4 foi " + str(roll(4,1))
        bot.reply_to(message,resultado)
      elif intecao == 'd6':
        resultado = "O Resultado da rolagem do d6 foi "+ str(roll(6,1))
        bot.reply_to(message,resultado)
      elif intecao == 'd8':
        resultado = "O Resultado da rolagem do d8 foi "+ str(roll(8,1))
        bot.reply_to(message,resultado)
      elif intecao == 'd10':
        resultado = "O Resultado da rolagem do d10 foi "+ str(roll(10,1))
        bot.reply_to(message,resultado)
      elif intecao == 'd12':
        resultado = "O Resultado da rolagem do d12 foi "+ str(roll(12,1))
        bot.reply_to(message,resultado)
      elif intecao == 'd100':
        resultado = "O Resultado da rolagem do d100 foi "+ str(roll(100,1))
        bot.reply_to(message,resultado)

bot.polling()
