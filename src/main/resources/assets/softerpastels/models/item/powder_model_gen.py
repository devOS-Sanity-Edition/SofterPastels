import json

colors = ["white", "light_red", "red", "orange", "yellow", "light_green", "green", "light_blue", "blue", "purple", "magenta", "brown", "black", "light_gray", "gray"]

def create_powder(color):
    with open(f"./{color}_powder.json", "w") as f:
        json.dump(dye_format(color), f, indent=4)

def dye_format(color):
    return {
        "parent": "item/handheld",
        "textures": {
            "layer0": f"softerpastels:item/{color}_powder"
        }
    }

for color in colors:
    create_powder(color)