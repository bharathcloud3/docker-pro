from flask import Flask

# Create a Flask app
app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, Dockerized Flask App!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
